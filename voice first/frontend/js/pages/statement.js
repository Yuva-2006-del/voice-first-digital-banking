import { api } from "../services/apiService.js";
import assistant from "../assistant/assistantCore.js";

const list = document.getElementById("statementList");

async function loadStatement() {
    try {
        const data = await api.getMiniStatement();

        list.innerHTML = "";

        data.forEach(tx => {
            const li = document.createElement("li");
            li.innerText = `${tx.date} - ${tx.description} (₹${tx.amount})`;
            list.appendChild(li);
        });

        assistant.speak("Mini statement loaded");

    } catch (error) {
        console.error("Error loading statement:", error);
        assistant.speak("Unable to load statement");
    }
}

loadStatement();
