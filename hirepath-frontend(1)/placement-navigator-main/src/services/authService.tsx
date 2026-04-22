import axios from "axios";

const API_BASE_URL = "https://hirepath-backend-z804.onrender.com/api/auth";

export const registerUser = async (data: {
  name: string;
  email: string;
  password: string;
}) => {
  return axios.post(`${API_BASE_URL}/register`, data);
};

export const loginUser = async (data: {
  email: string;
  password: string;
}) => {
  return axios.post(`${API_BASE_URL}/login`, data);
};