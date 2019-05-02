var tuple = {
    "user_1": "Riya",
    "user_2": "Pooja",
    "user_3": "Jyoti"
};
function searchInTuple(val) {
    for (var key in tuple) {
        if (key == val) {
            return key + ": " + tuple[key];
        }
    }
    return "Nothing is found!";
}
console.log(searchInTuple("user_1"));
console.log(searchInTuple("user_6"));
