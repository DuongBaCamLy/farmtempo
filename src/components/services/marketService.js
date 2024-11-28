import axios from 'axios';

const API_URL = '/api/market';

export const fetchMarketProducts = async () => {
  const response = await axios.get(API_URL);
  return response.data;
};
