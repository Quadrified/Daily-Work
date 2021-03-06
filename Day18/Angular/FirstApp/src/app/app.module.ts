import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './user/register/register.component';
import { FormsModule } from '@angular/forms';
import { EditUserComponent } from './edit-user/edit-user.component';
import { PractiseComponent } from './practise/practise.component';
import { RedDirective } from './red.directive';
import { NotIfDirective } from './not-if.directive';
import { ReactiveFormsModule} from '@angular/forms';
import { NameEditorComponent } from './name-editor/name-editor.component';
import { ProfileEditorComponent } from './profile-editor/profile-editor.component';
import { SwiggyComponent } from './swiggy/swiggy.component';
import {HttpClientModule} from '@angular/common/http';
import { DisplayUsersComponent } from './display-users/display-users.component';
import { AddUserComponent } from './add-user/add-user.component';
import { PipesComponent } from './pipes/pipes.component';
import { CustomPipe } from './custom.pipe';

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    EditUserComponent,
    PractiseComponent,
    RedDirective,
    NotIfDirective,
    NameEditorComponent,
    ProfileEditorComponent,
    SwiggyComponent,
    DisplayUsersComponent,
    AddUserComponent,
    PipesComponent,
    CustomPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
