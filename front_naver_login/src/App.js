import { Route } from "react-router-dom";
import Home from "./pages/Home";
import Main from "./pages/Main";

function App() {
  return (
    <>
      <Route exact path="/" component={Main} />
      <Route exact path="/Home" component={Home} />
    </>
  );
}

export default App;
