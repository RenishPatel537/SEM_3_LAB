import logo from './logo.svg';
import './App.css';


const a = [
    {
        name:"nikunj",
        age : 19
    },
    {
        name:"keval",
        age : 61
    },
    {
        name:"rudra",
        age : 51
    },
    {
        name:"g5ng",
        age : 25
    }
]




function App() {
    
   const user = a.map((obj,i)=>{
        return <tr>
            <td>
                {i+1}
            </td>
            <td>
                {obj.name}
            </td>
            <td>
                {obj.age}
            </td>
        </tr>
    })

    return(
        <>
        
            <table border={1} cellSpacing={0}>
                {user}
            </table>
                
        </>
    )

}

export default App;
