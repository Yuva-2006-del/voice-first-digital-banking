import { api } from "../services/apiService.js";

document.getElementById("check").onclick = async () => {
  document.getElementById("balance").innerText =
    "₹ " + await api.getBalance();
};
