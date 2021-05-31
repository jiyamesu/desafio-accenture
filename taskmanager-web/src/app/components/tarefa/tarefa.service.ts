import { Injectable } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';

@Injectable({
  providedIn: 'root'
})
export class TarefaService {

  constructor(private snack: MatSnackBar) { }

  showOnConsole(msg: string): void {
    console.log(msg)
  }

  showMessage(msg: string): void {

    this.snack.open(msg, 'X', {
      duration: 3000,
      horizontalPosition: "right",
      verticalPosition: "top"
    })
    
  }

}
