import React, { useState } from 'react';

const Login = () => {
  const [role, setRole] = useState('');

  const handleLogin = () => {
    if (role === 'farmer') {
      window.location.href = '/farmer-login';
    } else if (role === 'admin') {
      window.location.href = '/admin-login';
    } else {
      alert('Please select a role to login!');
    }
  };

  return (
    <div>
      <h1>Login</h1>
      <div>
        <label>
          <input
            type="radio"
            value="farmer"
            checked={role === 'farmer'}
            onChange={(e) => setRole(e.target.value)}
          />
          Farmer
        </label>
        <label>
          <input
            type="radio"
            value="admin"
            checked={role === 'admin'}
            onChange={(e) => setRole(e.target.value)}
          />
          Admin
        </label>
      </div>
      <button onClick={handleLogin}>Login</button>
    </div>
  );
};

export default Login;
