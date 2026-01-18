// languageDetect.js

const LANGUAGE_KEYWORDS = {
    "en-IN": ["balance", "save", "send", "open", "loan"],
    "hi-IN": ["बचत", "भेजो", "पैसे", "खाता", "ऋण"],
    "ta-IN": ["சேமி", "பணம்", "கணக்கு", "அனுப்பு"],
    "te-IN": ["సేవ్", "డబ్బు", "ఖాతా"],
    "kn-IN": ["ಉಳಿಸಿ", "ಹಣ", "ಖಾತೆ"],
    "ml-IN": ["സംരക്ഷിക്കുക", "പണം"],
    "mr-IN": ["जतन", "पैसे"],
    "bn-IN": ["টাকা", "সঞ্চয়"],
    "gu-IN": ["પૈસા", "સંગ્રહ"],
    "pa-IN": ["ਪੈਸੇ", "ਬਚਤ"],
    "or-IN": ["ଟଙ୍କା"],
    "as-IN": ["টকা"],
    "ur-IN": ["پیسے"]
};

class LanguageDetector {
    detect(text) {
        const lowerText = text.toLowerCase();

        for (let lang in LANGUAGE_KEYWORDS) {
            if (LANGUAGE_KEYWORDS[lang].some(word => lowerText.includes(word))) {
                return lang;
            }
        }

        return "en-IN";
    }
}

export default new LanguageDetector();
