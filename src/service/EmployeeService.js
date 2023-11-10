import axios from "axios";
const BASE_URL="http://localhost:9988/getAllEmployees";
class EmployeeService{
    //Method To Get employess from Database through API
    saveEmployee(){
        return axios.get(BASE_URL);
    }

    
}
export default EmployeeService();