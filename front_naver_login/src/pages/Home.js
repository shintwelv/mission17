import React, { Component } from "react";
import { Link } from "react-router-dom";

const Home = () => {
  return (
    <div>
      <span>*네이버 아이디로 로그인이 제대로 처리되었습니다</span>
      <br />
      <Link to="/">
        <button>처음으로</button>
      </Link>
    </div>
  );
};

export default Home;
