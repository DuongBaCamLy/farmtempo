import axios from 'axios';

const API_URL = '/api/fields';

export const fetchFields = async () => {
  const response = await axios.get(API_URL);
  return response.data;
};
