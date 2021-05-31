import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TarefaService } from 'src/app/components/tarefa/tarefa.service';

@Component({
  selector: 'app-tarefa-crud',
  templateUrl: './tarefa-crud.component.html',
  styleUrls: ['./tarefa-crud.component.css']
})
export class TarefaCrudComponent implements OnInit {

  constructor(private service: TarefaService, private router: Router) { }

  ngOnInit(): void {    
    this.service.showOnConsole('tarefa-crud.component.ts was invoked.')
  }

  createTarefa(): void {
    this.service.showMessage("Tarefa criada com sucesso.")
  }

  cancel(): void {
    this.router.navigate([''])
  }

}
