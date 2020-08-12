<template>
  <div class="book-container">
    <book-card v-bind:key="book.title" v-for="book in getBooks" v-bind:book="book" v-bind:author="book.title" v-bind:class="{read: book.read}"></book-card>
    
    
   
  </div>
</template>

<script>
import BookCard from './BookCard';

export default {
  components: {
    BookCard
  },
  computed: {
    getBooks() {
      const books = this.$store.state.books
      return books;
    }
  },
    name: 'reading-list'
}
</script>


<style>

.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>