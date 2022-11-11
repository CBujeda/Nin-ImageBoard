import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TabComponent } from './private/tab/tab.component';
import { PublicTabComponent } from './public/public-tab/public-tab.component';
import { PublicMainComponent } from './public/public-main/public-main.component';
import { PublicSearchComponent } from './public/public-search/public-search.component';



@NgModule({
  declarations: [
    AppComponent,
    TabComponent,
    PublicTabComponent,
    PublicMainComponent,
    PublicSearchComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
