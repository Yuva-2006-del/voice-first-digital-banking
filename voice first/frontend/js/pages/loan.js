import { api } from "../services/apiService.js";
import assistant from "../assistant/assistantCore.js";

const statusEl = document.getElementById("loanStatus");

async function loadStatus() {
  statusEl.innerText = await api.getLoanStatus();
}

document.getElementById("applyLoanBtn").onclick = async () => {
  const amount = document.getElementById("loanAmount").value;
  const tenure = document.getElementById("loanTenure").value;

  const res = await api.applyLoan(amount, tenure);
  assistant.speak(res);
  loadStatus();
};

loadStatus();
