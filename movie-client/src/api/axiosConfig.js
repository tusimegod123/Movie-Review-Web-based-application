import axios from "axios";

export default axios.create({
  baseURL: "http://localhost:8585",
  //   headers: { "ngrok-skip-browser-warning": "true" },
});
