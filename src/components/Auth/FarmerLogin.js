import React, { useState } from 'react';
import { createAccount } from '../../services/authService';

const CreateAccount = () => {
  const [form, setForm] = useState({
    username: '',
    email: '',
    password: '',
    role: 'farmer',
  });

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      await createAccount(form);
      alert('Account created successfully!');
      window.location.href = '/farmer-login';
    } catch (error) {
      alert('Error creating account');
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <h1>Create Farmer Account</h1>
      <input
        name="username"
        placeholder="Username"
        value={form.username}
        onChange={handleChange}
      />
      <input
        name="email"
        placeholder="Email"
        value={form.email}
        onChange={handleChange}
      />
      <input
        type="password"
        name="password"
        placeholder="Password"
        value={form.password}
        onChange={handleChange}
      />
      <button type="submit">Create Account</button>
    </form>
  );
};

export default CreateAccount;
