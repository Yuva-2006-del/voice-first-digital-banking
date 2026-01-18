const app = document.getElementById("app");

/**
 * Load page into main container
 */
async function loadPage(page) {
  try {
    const response = await fetch(`./pages/${page}.html`);
    const html = await response.text();
    app.innerHTML = html;

    // Load page-specific JS if exists
    const script = document.createElement("script");
    script.type = "module";
    script.src = `./js/pages/${page}.js`;
    document.body.appendChild(script);

  } catch (err) {
    app.innerHTML = "<h3>Page not found</h3>";
  }
}

/**
 * Navigation handler
 */
window.navigate = function (page) {
  loadPage(page);
};

/**
 * Load home page by default
 */
loadPage("home");
