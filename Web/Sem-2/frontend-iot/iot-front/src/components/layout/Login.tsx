'use client'
import '../../styles/styles.css';

export default function Login() {
  return (
      <div className="flex items-center justify-center min-h-screen bg-gray-100">
          <div className="bg-white p-8 rounded-lg shadow-md w-96">
              <h2 className="text-2xl font-semibold mb-6 text-center">Login</h2>
              <form>
                  <div className="mb-4">
                      <label htmlFor="username" className="block text-sm font-medium text-gray-700">Usuário:</label>
                      <input 
                          type="text" 
                          id="username" 
                          name="username" 
                          required 
                          className="mt-1 block w-full border-gray-300 rounded-md shadow-sm focus:border-blue-500 focus:ring focus:ring-blue-500 focus:ring-opacity-50"
                      />
                  </div>
                  <div className="mb-4">
                      <label htmlFor="password" className="block text-sm font-medium text-gray-700">Senha:</label>
                      <input 
                          type="password" 
                          id="password" 
                          name="password" 
                          required 
                          className="mt-1 block w-full border-gray-300 rounded-md shadow-sm focus:border-blue-500 focus:ring focus:ring-blue-500 focus:ring-opacity-50"
                      />
                  </div>
                  <button 
                      type="submit" 
                      className="w-full py-2 mt-4 bg-blue-600 text-white rounded-md hover:bg-blue-700 transition"
                  >
                      Entrar
                  </button>
              </form>
              <a href="/esqueci-minha-senha" className="block text-center mt-4 text-sm text-blue-600 hover:underline">
                  Esqueci minha senha
              </a>
          </div>
      </div>
  );
}

