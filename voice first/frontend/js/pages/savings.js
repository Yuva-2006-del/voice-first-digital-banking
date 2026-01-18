import { api } from "../services/apiService.js";
import assistant from "../assistant/assistantCore.js";

const balanceEl = document.getElementById("savingsBalance");
const saveAmount = document.getElementById("saveAmount");

async function loadBalance() {
  const bal = await api.getSavings();
  balanceEl.innerText = `Savings Balance: ₹${bal}`;
}

document.getElementById("saveBtn").onclick = async () => {
  const amt = saveAmount.value;
  const res = await api.addSavings(amt);
  assistant.speak(res);
  loadBalance();
};

document.getElementById("withdrawBtn").onclick = async () => {
  assistant.speak("Withdraw feature demo only");
};

loadBalance();
