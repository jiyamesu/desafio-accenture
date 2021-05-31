import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TarefaService } from 'src/app/components/tarefa/tarefa.service';

@Component({
  selector: 'app-create',
  templateUrl: './create.component.html',
  styleUrls: ['./create.component.css']
})
export class CreateComponent implements OnInit {

  constructor(private service: TarefaService, private router: Router) { }

  ngOnInit(): void {
  }

  createTarefa(): void {
    this.service.showMessage("Tarefa criada com sucesso.")
  }

  cancel(): void {
    this.router.navigate([''])
  }

}
