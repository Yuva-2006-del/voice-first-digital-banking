import { api } from "../services/apiService.js";
import { parseIntent } from "./intentParser.js";

class Assistant {

  speak(text) {
    const utter = new SpeechSynthesisUtterance(text);
    utter.lang = "en-IN";
    speechSynthesis.speak(utter);
  }

  async handle(text) {
    const intent = parseIntent(text);

    switch (intent.type) {
      case "BALANCE":
        this.speak(`Your balance is ${await api.getBalance()} rupees`);
        break;

      case "SAVE":
        this.speak(await api.addSavings(intent.amount));
        break;

      case "LOAN":
        this.speak(await api.getLoanStatus());
        break;

      case "STATEMENT":
        const list = await api.getMiniStatement();
        list.forEach(tx =>
          this.speak(`${tx.description} ${tx.amount} rupees`)
        );
        break;

      default:
        this.speak("Sorry, I did not understand");
    }
  }
}

export default new Assistant();

