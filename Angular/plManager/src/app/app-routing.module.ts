import { NgModule } from '@angular/core';

import {Routes, RouterModule} from '@angular/router';
import { ManagerComponent } from './manager/manager.component';

import { GoalsClubComponent } from './goals-club/goals-club.component';
import { WinsClubComponent } from './wins-club/wins-club.component';
import { RandomMatchComponent } from './random-match/random-match.component';
import { DateSortComponent } from './date-sort/date-sort.component';

const routes: Routes = [
  {path: 'pointSort', component: ManagerComponent},
  {path: 'goalsDecending', component: GoalsClubComponent },
  {path: 'winsDecending', component: WinsClubComponent},
  {path: 'randomMatch', component: RandomMatchComponent},
  {path: 'dateSort', component: DateSortComponent}
];

@NgModule({
  declarations: [],
  imports:[RouterModule.forRoot(routes)],
  exports: [RouterModule]

  
})
export class AppRoutingModule { }
export const routingComponents = [ManagerComponent,GoalsClubComponent,WinsClubComponent,RandomMatchComponent,DateSortComponent]