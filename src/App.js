import AddEmployeeComponent from "./component/AddEmployee";
import ListEmployeeComponent from "./component/EmployeeListComponent";
import FooterComponent from "./component/FooterComponent";
import HeaderComponent from "./component/HeaderComponent";
import { BrowserRouter,Routes,Route, Router } from "react-router-dom";


function App() {
  return (
    
      <BrowserRouter>
      <div className="container">
      <HeaderComponent/>
        <Routes>
          <Route path="/" element={<ListEmployeeComponent/>}/>
          <Route path="/employee" element={<ListEmployeeComponent/>}/>
          <Route path="/add-Employee" element={<AddEmployeeComponent/>}/>
          <Route path="/add-Employee/id" element={<AddEmployeeComponent/>}/>
        </Routes>
        <FooterComponent/> 
        </div>
     
      </BrowserRouter>
   
  );
}
export default App;
