const getRandom=(min,max)=>{
    return Math.floor(Math.random()*(max-min+1))+min;
};

const createRandomArray=()=>{
    const titles=["The Matrix","The Mummy", "Ford vs Ferrari", "Inception", "Interstellar"];
    const generes=["Action","Action","Drama","Thriller","Sci-Fi"];
    const randomTitles= titles[getRandom(0,titles.length-1)];
    const randomGeneres=generes[getRandom(0,generes.length-1)];
    const randomRating=getRandom(1,10);
    return{
        title:randomTitles,
        genre:randomGeneres,
        rating:randomRating
    };
};

const movies=Array.from({length:5}, createRandomArray);
const sortedMovies=movies.sort((a,b)=> a.rating-b.rating);
const sortedMoviesByName=movies.sort((a,b) => (a.title > b.title) ? 1 : ((b.title> a.title) ? -1 : 0))
const highlyRatedMovies=sortedMovies.filter(movie =>movie.rating >=5);


console.log(`Movies sorted by rating:`)
sortedMovies.forEach(movie =>{
    console.log(`Title : ${movie.title}, Genre: ${movie.genre}, Rating: ${movie.rating}`)
})

console.log(`Movies sorted by title:`)
sortedMoviesByName.forEach(movie =>{
    console.log(`Title : ${movie.title}, Genre: ${movie.genre}, Rating: ${movie.rating}`)
})