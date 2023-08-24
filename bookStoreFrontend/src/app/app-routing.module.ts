import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {HomeComponent} from "./guest/home/home.component";
import {LoginComponent} from "./guest/login/login.component";
import {RegisterComponent} from "./guest/register/register.component";
import {ProfileComponent} from "./user/profile/profile.component";
import {AdminComponent} from "./admin/admin/admin.component";
import {NotFoundComponent} from "./error/not-found/not-found.component";
import {UnauthorizedComponent} from "./error/unauthorized/unauthorized.component";

const routes: Routes = [
  {path: "", redirectTo: "home", pathMatch: "full"},

  {path: "home", component: HomeComponent},
  {path: "login", component: LoginComponent},
  {path: "register", component: RegisterComponent},

  {path: "profile", component: ProfileComponent},

  {path: "admin", component: AdminComponent},

  {path: "404", component: NotFoundComponent},
  {path: "401", component: UnauthorizedComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
