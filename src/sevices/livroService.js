const API_URL = "http://localhost:8080/livros";

export async function buscarLivros() {
  const response = await fetch(API_URL);
  return response.json();
}