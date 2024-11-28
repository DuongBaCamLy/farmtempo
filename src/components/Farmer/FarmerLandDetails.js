import React, { useEffect, useState } from 'react';
import { fetchFields } from '../../services/fieldService';

const FarmerLandDetails = () => {
  const [fields, setFields] = useState([]);

  useEffect(() => {
    const getFields = async () => {
      const data = await fetchFields();
      setFields(data);
    };
    getFields();
  }, []);

  return (
    <div>
      <h1>Land Details</h1>
      <ul>
        {fields.map((field) => (
          <li key={field.fieldId}>
            <h2>{field.fieldName}</h2>
            <p>Location: {field.fieldLocation}</p>
            <p>Soil Type: {field.soilType}</p>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default FarmerLandDetails;
