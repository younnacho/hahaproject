<template>
  <div>
    <v-img
      class="mx-auto my-6"
      max-width="228"
      src="https://play-lh.googleusercontent.com/X0F73sNd54RPhUJCMlRAINxhGKxw18jkBgw4E5F6dIs_7pL5Geg0xWt5taQwisw47ok"
    ></v-img>

    <v-card
      class="mx-auto pa-12 pb-8"
      elevation="8"
      max-width="448"
      rounded="lg"
    >
      <div class="text-subtitle-1 text-medium-emphasis">ID</div>

      <v-text-field
        density="compact"
        placeholder="Enter your id"
        prepend-inner-icon="mdi-email-outline"
        variant="outlined"
        v-model="memberid"
      ></v-text-field>

      <div
        class="text-subtitle-1 text-medium-emphasis d-flex align-center justify-space-between"
      >
        Password

        <a
          class="text-caption text-decoration-none text-blue"
          href="#"
          rel="noopener noreferrer"
          target="_blank"
        >
          Forgot login password?</a
        >
      </div>

      <v-text-field
        :append-inner-icon="visible ? 'mdi-eye-off' : 'mdi-eye'"
        :type="visible ? 'text' : 'password'"
        density="compact"
        placeholder="Enter your password"
        prepend-inner-icon="mdi-lock-outline"
        variant="outlined"
        @click:append-inner="visible = !visible"
        v-model="memberpw"
      ></v-text-field>

      <v-btn block class="mb-8" color="blue" size="large" variant="tonal" @click="login">
        Log In
      </v-btn>


      <v-card-text class="text-center">
        <a
          class="text-blue text-decoration-none"
          href="#"
          rel="noopener noreferrer"
          target="_blank"
        >
          Sign up now <v-icon icon="mdi-chevron-right"></v-icon>
        </a>
      </v-card-text>
    </v-card>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data: () => ({
    visible: false,
    memberid: '',
    memberpw: '',
  }),

  methods: {
    async login() {
      try {
        axios.defaults.withCredentials = true;

        const requestBody = {
          MemberId: this.memberid,
          MemberPw: this.memberpw,
        };

        console.log(this.memberid);
        console.log(this.memberpw);

        const response = await axios.post('http://localhost:8080/member/login', requestBody)
        .then(res => {
          console.log("로그인 성공~!~!");
          console.log(res);
        })
        .catch(error => {
          console.log(error);
        })
      } catch (error) {
        console.error('An error occurred:', error);
      }
    },
  },
};
</script>