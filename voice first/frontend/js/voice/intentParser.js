export function parseIntent(text) {
  text = text.toLowerCase();

  // Balance
  if (text.includes("balance")) {
    return { intent: "BALANCE" };
  }

  // Save money
  if (text.includes("save")) {
    const amount = text.match(/\d+/)?.[0];
    return { intent: "SAVE", amount };
  }

  // Loan
  if (text.includes("loan")) {
    return { intent: "LOAN" };
  }

  // Mini statement
  if (text.includes("statement")) {
    return { intent: "STATEMENT" };
  }

  return { intent: "UNKNOWN" };
}
