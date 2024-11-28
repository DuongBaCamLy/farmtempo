import axios from 'axios';

const API_URL = '/api/accounts';

export const createAccount = async (account) => {
  const response = await axios.post(API_URL, account);
  return response.data;
};
