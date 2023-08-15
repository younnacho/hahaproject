<template>
  <v-app-bar flat>
    <v-app-bar-title class="d-flex align-center">
      <v-icon
        icon="$vuetify"
        class="my-4; left-aligned"
        style="margin-left: 10px"
      ></v-icon>

      <span class="logo" style="margin-left: 5px">우리WONFIT</span>
      <v-spacer></v-spacer>
      <!-- Spacer 추가 -->
    </v-app-bar-title>
    <v-chip-group class="right-aligned" style="margin-right: 10px">
      <v-chip>로그인</v-chip>
      <v-chip>회원가입</v-chip>
      <v-chip>마이페이지</v-chip>
    </v-chip-group>
  </v-app-bar>
</template>

<script setup>
//
</script>

<style scoped></style>
