import React, { useEffect, useState } from 'react';
import { fetchAccounts, deleteAccount } from '../../services/accountService';

const AccountList = () => {
  const [accounts, setAccounts] = useState([]);

  useEffect(() => {
    const getAccounts = async () => {
      const data = await fetchAccounts();
      setAccounts(data);
    };
    getAccounts();
  }, []);

  const handleDelete = async (id) => {
    await deleteAccount(id);
    setAccounts(accounts.filter((account) => account.accountId !== id));
  };

  return (
    <div>
      <h1>Account List</h1>
      <ul>
        {accounts.map((account) => (
          <li key={account.accountId}>
            {account.username} - {account.email}
            <button onClick={() => handleDelete(account.accountId)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default AccountList;
