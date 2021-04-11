import React from "react";
import Header from "./components/Header";
import Tile from "./components/Tile";

const Home = (props: HomeProps) => {
  return (
    <div className="home">
      <Header></Header>
      <Tile></Tile>
      <Tile></Tile>
      <Tile></Tile>
      <Tile></Tile>
      <Tile></Tile>
      <Tile></Tile>
      <Tile></Tile>
    </div>
  );
};

interface HomeProps {}

export default Home;
