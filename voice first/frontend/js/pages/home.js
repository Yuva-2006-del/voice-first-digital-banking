import assistant from "../assistant/assistantCore.js";
import { api } from "../services/apiService.js";

// Voice button inside home banner
const tryVoiceBtn = document.getElementById("tryVoice");
if (tryVoiceBtn) {
  tryVoiceBtn.onclick = () => {
    assistant.speak("Voice assistant activated. Please speak your command.");
  };
}

// Check Balance quick action
const checkBalanceBtn = document.getElementById("checkBalance");
if (checkBalanceBtn) {
  checkBalanceBtn.onclick = async () => {
    const balance = await api.getBalance();
    assistant.speak(`Your balance is ${balance} rupees`);
  };
}
