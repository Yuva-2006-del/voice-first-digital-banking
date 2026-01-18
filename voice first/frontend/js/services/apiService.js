const BASE_URL = "http://localhost:8080/api";

export const api = {

  // Auth
  verifyFace: () =>
    fetch(`${BASE_URL}/auth/face/verify`, { method: "POST" }).then(r => r.json()),

  // Bank
  getBalance: () =>
    fetch(`${BASE_URL}/bank/balance`).then(r => r.json()),

  sendMoney: (amount, to) =>
    fetch(`${BASE_URL}/bank/send`, {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ amount, to })
    }).then(r => r.text()),

  // Savings
  addSavings: amount =>
    fetch(`${BASE_URL}/savings/add?amount=${amount}`, { method: "POST" })
      .then(r => r.text()),

  getSavings: () =>
    fetch(`${BASE_URL}/savings/balance`).then(r => r.json()),

  // Loan
  applyLoan: (amount, tenure) =>
    fetch(`${BASE_URL}/loan/apply?amount=${amount}&tenure=${tenure}`,
      { method: "POST" }).then(r => r.text()),

  getLoanStatus: () =>
    fetch(`${BASE_URL}/loan/status`).then(r => r.text()),

  // Statement
  getMiniStatement: () =>
    fetch(`${BASE_URL}/statement/mini`).then(r => r.json()),

  // History
  getHistory: () =>
    fetch(`${BASE_URL}/history`).then(r => r.json())
};
export const apii = {
    async getMiniStatement() {
        // MOCK DATA
        return [
            { date: "18 Jan", description: "Grocery Store", amount: 450 },
            { date: "17 Jan", description: "Electricity Bill", amount: 1200 },
            { date: "16 Jan", description: "Transfer to Amma", amount: 500 }
        ];
    }
};
