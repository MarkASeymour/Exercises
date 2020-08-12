<template>
  <div class="container">
    <h2 v-bind:class="book-title">{{ book.title }}</h2>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <h3 v-bind:class="book-author">{{ book.author }}</h3>
    <p>{{book.read === true ? "I have read this book" : "I have not read this book"}}</p>
  </div>
</template>

<script>
export default {
props: [
    'book'
]

}
</script>

<style>

</style>