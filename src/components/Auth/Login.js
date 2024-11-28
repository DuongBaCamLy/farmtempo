import React from 'react';
import { Link } from 'react-router-dom';

const FarmerDashboard = () => {
  return (
    <div>
      <h1>Farmer Dashboard</h1>
      <ul>
        <li>
          <Link to="/land-details">Land Information</Link>
        </li>
        <li>
          <Link to="/market">Market</Link>
        </li>
      </ul>
    </div>
  );
};

export default FarmerDashboard;
