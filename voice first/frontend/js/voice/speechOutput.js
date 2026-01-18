// speechOutput.js

class SpeechOutput {
    speak(text, languageCode) {
        if (!text) return;

        const utterance = new SpeechSynthesisUtterance(text);
        utterance.lang = languageCode || "en-IN";
        utterance.rate = 0.9;
        utterance.pitch = 1;

        window.speechSynthesis.cancel();
        window.speechSynthesis.speak(utterance);
    }
}

export default new SpeechOutput();
