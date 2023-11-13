import React, { useEffect, useState } from 'react'
import { Link } from 'react-router-dom'
import EmployeeService from '../service/EmployeeService';

const ListEmployeeComponent = () => {
  var EmployeeArray=()=>{
    let arr=[];
  }
  var [employeeArray,setEmployee]=useState([]);
  
  useEffect(()=>{
    getAllEmployee();
  },[]);

  function getAllEmployee(){
    EmployeeService.getAllEmployees()
    .then(res=>{setemployeeArray(res.data);console.log("The Results Fetched SuccessFully ")})
    .catch(e=>console.log("Error"));
  }
  return (
    <div className='container'>
        <Link to={"/add-Employee"} className='btn btn-primary mb-2 mt-3' href="">Add Employee</Link>
        <h2 className='text-center mb-4'>List Employee</h2>
        <table className='table table-bordered table striped'>
            <thead>
                <th>Employee ID</th>
                <th>Employee First Name</th>
                <th>Employee Last Name</th>
                <th>Employee Email</th>
                <th>Actions</th>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
  )
}

export default ListEmployeeComponent

