fetch("https://codeforces.com/api/user.info?handles=MostafaVT")
  .then((res) => res.json())
  .then((data) => console.log(data));

fetch("https://codeforces.com/api/user.rating?handle=MostafaVT")
  .then((res) => res.json())
  .then((data) => console.log(data));
