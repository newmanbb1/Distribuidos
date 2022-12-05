<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\PersonaController;
/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/
Route::get('/persona',[PersonaController::class,'index']);
Route::get('/persona/{persona}',[PersonaController::class,'show']);
Route::post('/persona',[PersonaController::class,'store']);
Route::put('/persona/{persona}',[PersonaController::class,'update']);
Route::delete('/persona/{persona}',[PersonaController::class,'destroy']);


