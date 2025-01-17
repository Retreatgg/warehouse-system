<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>История операций</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .breadcrumb-item a {
            text-decoration: none;
        }
        .table th, .table td {
            vertical-align: middle;
        }
        .btn-primary {
            background-color: #ff8c00;
            border: none;
        }
        .btn-primary:hover {
            background-color: #e67e00;
        }
        .form-control:focus {
            box-shadow: none;
            border-color: #ff8c00;
        }
    </style>
</head>
<body>
<div class="container py-5">
    <!-- Навигация -->
    <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#">Главная</a></li>
            <li class="breadcrumb-item active" aria-current="page">История операций</li>
        </ol>
    </nav>

    <!-- Шапка страницы -->
    <div class="d-flex justify-content-between align-items-center mb-4">
        <h1 class="h3">История операций</h1>
    </div>

    <!-- Фильтры -->
    <div class="mb-4 p-3 bg-white rounded shadow-sm">
        <h5>Фильтры</h5>
        <form class="row g-3 mt-2">
            <div class="col-md-3">
                <label for="startDate" class="form-label">Дата от</label>
                <input type="date" class="form-control" id="startDate">
            </div>
            <div class="col-md-3">
                <label for="endDate" class="form-label">Дата до</label>
                <input type="date" class="form-control" id="endDate">
            </div>
            <div class="col-md-3">
                <label for="operationType" class="form-label">Тип операции</label>
                <select class="form-select" id="operationType">
                    <option selected>Все</option>
                    <option value="receive">Приём</option>
                    <option value="move">Перемещение</option>
                    <option value="write-off">Списание</option>
                    <option value="inventory">Инвентаризация</option>
                </select>
            </div>
            <div class="col-md-3">
                <label for="warehouse" class="form-label">Склад</label>
                <select class="form-select" id="warehouse">
                    <option selected>Все</option>
                    <option value="1">Склад 1</option>
                    <option value="2">Склад 2</option>
                    <option value="3">Склад 3</option>
                </select>
            </div>
            <div class="col-12 text-end">
                <button type="button" class="btn btn-primary">Применить</button>
            </div>
        </form>
    </div>

    <!-- Таблица операций -->
    <div class="bg-white rounded shadow-sm p-3">
        <h5>Список операций</h5>
        <table class="table table-hover mt-3">
            <thead class="table-light">
            <tr>
                <th>#</th>
                <th>Дата</th>
                <th>Тип операции</th>
                <th>Склад</th>
<#--                <th>Пользователь</th>-->
                <th>Действия</th>
            </tr>
            </thead>
            <tbody>
            <#list operations as operation>
                <tr>
                    <td>${operation.id}</td>
                    <td>${operation.date}</td>
                    <td>${operation.operationType.name}</td>
                    <td>${operation.warehouse.name}</td>
<#--                    <td>Иванов И.И.</td>-->
                    <td>
                        <button class="btn btn-sm btn-primary"><a href="/operations/${operation.id}">Детали</a></button>
                    </td>
                </tr>
            </#list>
<#--            <tr>-->
<#--                <td>2</td>-->
<#--                <td>2025-01-12</td>-->
<#--                <td>Перемещение</td>-->
<#--                <td>Склад 2</td>-->
<#--                <td>Петров П.П.</td>-->
<#--                <td>-->
<#--                    <button class="btn btn-sm btn-primary">Детали</button>-->
<#--                </td>-->
<#--            </tr>-->
<#--            <tr>-->
<#--                <td>3</td>-->
<#--                <td>2025-01-14</td>-->
<#--                <td>Списание</td>-->
<#--                <td>Склад 3</td>-->
<#--                <td>Сидоров С.С.</td>-->
<#--                <td>-->
<#--                    <button class="btn btn-sm btn-primary">Детали</button>-->
<#--                </td>-->
<#--            </tr>-->
            </tbody>
        </table>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>