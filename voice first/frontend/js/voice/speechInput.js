// speechInput.js

class SpeechInput {
    constructor() {
        const SpeechRecognition =
            window.SpeechRecognition || window.webkitSpeechRecognition;

        this.recognition = new SpeechRecognition();
        this.recognition.continuous = false;
        this.recognition.interimResults = false;
    }

    startListening(languageCode, onResultCallback) {
        this.recognition.lang = languageCode || "en-IN";

        this.recognition.start();

        this.recognition.onresult = (event) => {
            const text = event.results[0][0].transcript;
            onResultCallback(text, this.recognition.lang);
        };

        this.recognition.onerror = (error) => {
            console.error("Speech recognition error:", error);
        };
    }
}

export default new SpeechInput();
export function startListening(callback) {
  const SpeechRecognition =
    window.SpeechRecognition || window.webkitSpeechRecognition;

  const recognition = new SpeechRecognition();
  recognition.lang = "en-IN";
  recognition.continuous = false;

  recognition.onresult = event => {
    const text = event.results[0][0].transcript;
    callback(text);
  };

  recognition.start();
}
