import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HomeComponent } from './views/home/home.component';
import { TarefaCrudComponent } from './views/tarefa-crud/tarefa-crud.component';
import { CreateComponent } from './components/tarefa/create/create.component'

const routes: Routes = [
  {
    path: "",
    component: HomeComponent
  },
  {
    path: "nova-tarefa",
    component: TarefaCrudComponent
  },
  {
    path: "create",
    component: CreateComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
