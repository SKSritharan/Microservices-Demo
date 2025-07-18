import { Routes } from '@angular/router';
import { HomePage } from './pages/home-page/home-page';
import { AddProduct } from './pages/add-product/add-product';

export const routes: Routes = [
  {path: '', component: HomePage},
  {path: 'add-product', component: AddProduct}
];
