import { Link, Outlet } from "react-router-dom";

function Layout(){
    return(
        <>
        
            <div className="container border border-dark">
                <div className="row m-1">
                    <div className="col-2 border border-primary mx-1">LOGo</div>
                    <div className="col d-flex justify-content-around border border-warning">
                        <Link to="/home">Home</Link>
                        <Link to="/about">About</Link>
                        <Link to="/contact">Contact</Link>
                    </div>
                </div>
                <div className="row m-1">
                    <div className="col-4 border border-primary">sidebar</div>
                    <div className="col border border-danger"><Outlet/></div>
                </div>
                <div className="row">
                    <div className="col border border-dark m-2">Footter</div>
                </div>
            </div>

        </>
    )
}

export default Layout