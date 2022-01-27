new gridjs.Grid({
    columns: ["Name", "Email", "Phone Number"],
    pagination:true,
    sort:true,
    data: [
      ["GOPAL", "gopal@example.com", "33333333333"],
      ["GOKU", "goku@gmail.com", "4444444444"],
      ["VEGETA", "veg@gmail.com", "44444 00033"],
      ["ZILONG", "zil@gmail.com", "9837827 1233"],
      ["CHERIMI", "cher@mail.com", "34802308356"]
    ]
}).render(document.getElementById("wrapper"));