import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import LoginAccount from './components/Auth/LoginAccount';  // Đổi tên từ Login.js thành LoginAccount.js
import CreateAccount from './components/Farmer/CreateAccount';
import FarmerDashboard from './components/Farmer/FarmerDashboard';
import FarmerLandDetails from './components/Farmer/FarmerLandDetails';
import FarmerMarket from './components/Farmer/FarmerMarket';

const App = () => {
  return (
    <Router>
      <Routes>
        {/* Trang Login */}
        <Route path="/" element={<LoginAccount />} />
        
        {/* Trang Tạo Tài Khoản Farmer */}
        <Route path="/create-account" element={<CreateAccount />} />
        
        {/* Trang Dashboard của Farmer */}
        <Route path="/farmer-dashboard" element={<FarmerDashboard />} />
        
        {/* Trang Thông Tin Đất Đai */}
        <Route path="/land-details" element={<FarmerLandDetails />} />
        
        {/* Trang Thị Trường */}
        <Route path="/market" element={<FarmerMarket />} />
      </Routes>
    </Router>
  );
};

export default App;

