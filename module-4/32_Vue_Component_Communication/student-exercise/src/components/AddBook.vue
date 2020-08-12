<template>
  <div>
      <form v-on:submit.prevent="addBook" class="add-book">
          <input type="text" class="title-input" v-model="newBook.title"
          placeholder="Title"/>
          <input type="text" class="author-input" v-model="newBook.author"
          placeholder="Author"/>
          <input type="text" class="isbn-input" v-model="newBook.isbn"
          placeholder="ISBN"/>
          <input type="submit" value="Add Book">
      </form>
  </div>
</template>

<script>
export default {
    name: 'add-book',
    data() {
        return {
            newBook: {
                read: false
            }
        }
    },
    methods: {
        addBook() {
            this.$store.commit('addNewBook',this.newBook)
        },
        reset() {
            this.newBook = {
                read: false
            }
        }
    }
}
</script>

<style>
.title-input {
    padding: 1rem;
    margin: 1rem;
}
.author-input {
    padding: 1rem;
    margin: 1rem;
}
.isbn-input {
    padding: 1rem;
    margin: 1rem;
}
</style>