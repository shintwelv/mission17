import React, { Component } from "react";
import { useHistory } from "react-router-dom";
import NaverLogin from "react-login-by-naver";
import axios from "axios";

function Main() {
  const history = useHistory(); // 라우팅을 위한 히스토리 객체
  //네이버로그인성공시 호출되는 함수
  const responseLogin = (res, type) => {
    const id = res.id;
    // const password = res.password;
    const name = res.name;
    const email = res.email;

    let form = new FormData();
    form.append("id", id);
    // form.append("password", password);
    form.append("name", name);
    form.append("email", email);

    axios
      .post("http://localhost:9933/naver.do", form)
      .then(history.push("/Home"));
  };

  return (
    <NaverLogin
      clientId="h7ezqHQzhsKPP5QGGERj"
      callbackUrl="http://localhost:3000"
      render={(props) => (
        <div onClick={props.onClick}>
          <img src="/naver-login.PNG" />
        </div>
      )}
      onSuccess={(res) => responseLogin(res, "naver")}
      onFailure={() => console.log("naver login fail")}
    />
  );
}

export default Main;
