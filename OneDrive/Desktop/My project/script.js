const modal = document.getElementById("registerModal");
const openBtn = document.getElementById("openModalBtn");
const closeBtn = document.getElementById("closeModal");
const form = document.getElementById("registerForm");

// Ашылады
openBtn.addEventListener("click", function (e) {
  e.preventDefault();
  modal.style.display = "block";
});

// Жабылады
closeBtn.addEventListener("click", function () {
  modal.style.display = "none";
});

// Сыртынан басқанда жабылады
window.addEventListener("click", function (e) {
  if (e.target === modal) {
    modal.style.display = "none";
  }
});

// ✅ Форманы өңдеу және бағыттау
form.addEventListener("submit", function (e) {
  e.preventDefault(); // бет қайта жүктелмесін
  window.location.href = "success.html"; // жаңа бетке өту
});
const toggle = document.getElementById('menu-toggle');
const sideMenu = document.getElementById('side-menu');

toggle.addEventListener('click', () => {
  sideMenu.classList.toggle('open');
});