<!DOCTYPE html>
<html lang="en">
<head>

  <meta charset="UTF-8">
  <title>Daily UI | #001 - Sign Up</title>
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <style>
  $base-bgcolor: #354152;
  $base-color: #7e8ba3;
  $base-font-weight: 300;
  $base-font-size: 1rem;
  $base-line-height: 1.5;
  $base-font-family: Helvetica Neue;
  $base-font-family-fallback: sans-serif;

  * {
    box-sizing: border-box;
  }

  html {
    height: 100%;
  }

  body {
    background-color: $base-bgcolor;
    color: $base-color;
    font: $base-font-weight #{$base-font-size}/#{$base-line-height} $base-font-family, $base-font-family-fallback;
    margin: 0;
    min-height: 100%;
  }

  .align {
    align-items: center;
    display: flex;
    flex-direction: row;

    &__item {

      &--start {
        align-self: flex-start;
      }

      &--end {
        align-self: flex-end;
      }

    }

  }

  .site {

    &__main {
    }

    &__logo {
      margin-bottom: 2rem;
    }

  }

  $input-placeholder-color: #7e8ba3;

  input {
    border: 0;
    font: inherit;

    &::placeholder {
      color: $input-placeholder-color;
    }

  }

  .form {

    &__field {
      margin-bottom: 1rem;
    }

    input {
      outline: 0;
      padding: .5rem 1rem;

      &[type="email"],
      &[type="password"] {
        width: 100%;
      }

    }

  }

  $grid-max-width: 25rem;
  $grid-width: 100%;

  .grid {
    margin: 0 auto;
    max-width: $grid-max-width;
    width: $grid-width;
  }

  h2 {
    font-size: 2.75rem;
    font-weight: 100;
    margin: 0 0 1rem;
    text-transform: uppercase;
  }

  svg {
    height: auto;
    max-width: 100%;
    vertical-align: middle;
  }

  $link-color: #7e8ba3;

  a {
    color: $link-color
  }

  .register {
    box-shadow: 0 0 250px #000;
    text-align: center;
    padding: 4rem 2rem;

    input {
      border: 1px solid #242c37;
      border-radius: 999px;
      background-color: transparent;
      text-align: center;

      &[type="email"],
      &[type="password"] {
        background-repeat: no-repeat;
        background-size: 1.5rem;
        background-position: 1rem 50%;
      }

      &[type="submit"] {
        background-image: linear-gradient(160deg, #8ceabb 0%, #378f7b 100%);
        color: #fff;
        margin-bottom: 6rem;
        width: 100%;
      }

    }

  }

  </style>

</head>
<body class="align">

  <div class="grid align__item">

    <div class="register">

      <svg xmlns="http://www.w3.org/2000/svg" class="site__logo" width="56" height="84" viewBox="77.7 214.9 274.7 412"><defs><linearGradient id="a" x1="0%" y1="0%" y2="0%"><stop offset="0%" stop-color="#8ceabb"/><stop offset="100%" stop-color="#378f7b"/></linearGradient></defs><path fill="url(#a)" d="M215 214.9c-83.6 123.5-137.3 200.8-137.3 275.9 0 75.2 61.4 136.1 137.3 136.1s137.3-60.9 137.3-136.1c0-75.1-53.7-152.4-137.3-275.9z"/></svg>

      <h2>Sign Up</h2>

      <form action="" method="post" class="form">

        <div class="form__field">
          <input type="email" placeholder="info@mailaddress.com">
        </div>

        <div class="form__field">
          <input type="password" placeholder="••••••••••••">
        </div>

        <div class="form__field">
          <input type="submit" value="Sign Up">
        </div>

      </form>

      <p>Already have an accout? <a href="#">Log in</a></p>

    </div>

  </div>

</body>
</html>
